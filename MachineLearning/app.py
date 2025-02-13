from flask import Flask, request, jsonify
import joblib
import numpy as np

app = Flask(__name__)

# Step 2a: Load the pre-trained model
# Make sure the 'svm_best_model.pkl' file is in the same directory as app.py or adjust the path.
model = joblib.load(r'C:\Users\lenovo\Desktop\MachineLearning\svm_best_model.pkl')

# Step 2b: Create the predict endpoint
@app.route('/predict', methods=['POST'])
def predict():
    try:
        # Get the JSON data from the request
        data = request.get_json(force=True)
        
        # Expecting a JSON payload with key "features".
        # For a single sample, features should be a list of values.
        features = data.get('features')
        if features is None:
            return jsonify({'error': 'No features provided. Please include a "features" key in your JSON payload.'}), 400
        
        # Convert the features to a numpy array and reshape appropriately.
        # If you expect multiple samples, adjust this step accordingly.
        features_array = np.array(features).reshape(1, -1)
        print(features_array)
        # Make the prediction using the loaded model.
        prediction = model.predict(features_array)
        prediction_proba = model.predict_proba(features_array)[0].tolist()  # optional: get probabilities
        print(prediction)
        print(prediction_proba)

        # Return the prediction as a JSON response.
        return jsonify({
            'prediction': int(prediction[0]),
            'probability': prediction_proba
        })
    except Exception as e:
        # In case of error, return the error message.
        return jsonify({'error': str(e)}), 500

# Step 2c: Define a health check or default route (optional)
@app.route('/')
def index():
    return "SVM Prediction API is running!"

# Step 2d: Run the Flask app
if __name__ == '__main__':
    # Set debug=True for development. In production, use a proper WSGI server.
    app.run(debug=True)


# NOTE
# 0 - Normal Transaction, 1 - Fraudulent transaction
# [0.90, 0.10] - 90% chance for  the first class - normal and 10% chance for the second class (fraud)
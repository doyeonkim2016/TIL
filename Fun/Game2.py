# Get started with interactive Python
import turtle
import math
import random

wn = turtle.Screen()
wn.setup(700,700)
#wn.bgpic("C:\\Users\\Kim Do Yeon\\Desktop\\GameProject\\space.gif")
wn.bgcolor("black")
wn.tracer(0)

##turtle.addshape("C:\\Users\\Kim Do Yeon\\Desktop\\GameProject\\meteor.gif")
##turtle.addshape("C:\\Users\\Kim Do Yeon\\Desktop\\GameProject\\spaceship.gif")
#create pen
class Pen(turtle.Turtle):
  def __init__(self):
    turtle.Turtle.__init__(self)
    self.shape("square")
    self.color("white")
    self.penup()
    self.speed(0)
    
class Player(turtle.Turtle):
  def __init__(self):
    turtle.Turtle.__init__(self)
    self.shape("square")
    self.color("yellow")
    self.penup()
    self.speed(0)
    self.planet = 0
    
  def go_up(self):
    move_to_x=player.xcor()
    move_to_y=player.ycor() + 24
    
    if (move_to_x,move_to_y) not in walls:
        self.goto(move_to_x, move_to_y)
  
  def go_down(self):
    move_to_x=player.xcor()
    move_to_y=player.ycor() - 24
    
    if (move_to_x,move_to_y) not in walls:
        self.goto(move_to_x, move_to_y)  
        
  def go_right(self):
    move_to_x=player.xcor() + 24
    move_to_y=player.ycor() 
    
    if (move_to_x,move_to_y) not in walls:
        self.goto(move_to_x, move_to_y) 
        
  def go_left(self):
    move_to_x=player.xcor() - 24
    move_to_y=player.ycor() 
    
    if (move_to_x,move_to_y) not in walls:
        self.goto(move_to_x, move_to_y)
  
  def collide(self,other):
      a = self.xcor()-other.xcor()
      b = self.ycor()-other.ycor()
      distance = math.sqrt((a**2) +(b**2))
      if distance < 5:
          return True
      else:
          return False

class Planet(turtle.Turtle):
    def __init__(self,x,y):
        turtle.Turtle.__init__(self)
        self.shape("circle")
        self.color("gold")
        self.penup()
        self.speed(0)
        self.planet = 100
        self.goto(x,y)
    
    def destroy(self):
        self.goto(2000,2000)
        self.hideturtle()
        
class Obstacle(turtle.Turtle):
    def __init__(self,x,y):
        turtle.Turtle.__init__(self)
        self.shape("circle")
        self.color("red")
        self.penup()
        self.speed(0)
        self.goto(x,y)
        self.direction = random.choice(["up","down","left","right"])
    
    def move(self):
        if self.direction == "up":
            dx=0
            dy=24
        elif self.direction == "down":
            dx=0
            dy=-24
        elif self.direction == "left":
            dx=-24
            dy=0
        elif self.direction =="right":
            dx=24
            dy=0  
        else:
            dx=0
            dy=0

        move_to_x=self.xcor()+dx
        move_to_y=self.ycor()+dy
        
        if (move_to_x,move_to_y) not in walls:
            self.goto(move_to_x,move_to_y)
        else:
            self.direction = random.choice(["up","down","left","right"])
            
        turtle.ontimer(self.move,t=random.randint(100,300))
    
    def destroy(self):
        self.goto(2000,2000)
        self.hideturtle()
#create Levels list
levels = [""]

#define first level
level_1 = [
"XXXXXXXXXXXXXXXXXXXXXXXXX",
"P   XXXXXXXXX     O XXXXX",
"XX   XXXXXXXX  XX   XXXXX",
"XX  XXXXXX     XXX  XXXXX",
"XX            XXXX  XXXXX",
"XX  XXXXX  XXXXXXXXXXXXXX",
"XX  XXXXX  XXXXXXXXXXXXXX",
"XX     XX  XXXXXXXXXXXXXX",
"XXXXXX  X            XXX",
"XXXXXX  XXXXXX  XXXX  XXX",
"XXXXXX        O XXXX  XXX",
"XXXXXX          XXX   XXX",
"XXXXXXXXXXXXXXXXXXXX  XXX",
"XXXXXXXXXXXXXXXXXXXX  XXX",
"XXXXXXXXXXXXX XXXXXX  XXX",
"XXX   O                 X",
"XXXXXXXXXX XXXXXXXXXXXXXX",
"XXXXXXXXXX XXXXXXXXXXXXXX",
"XXXXXXXXXX XXXXXXXXXXXXXX",
"XXXXXXXXXXYXXXXXXXXXXXXXX",
"XXXXXXXXXXXXXXXXXXXXXXXXX",

]

planets=[]
obstacles=[]
                                           
#Add maze to mazes list
levels.append(level_1)

#Create Level Setup Function

def setup_maze(level):
  for y in range(len(level)):
    for x in range(len(level[y])):
      #Get the Character at each x,y coordinate
      #NOTE the order of the y and x in the next line
      character = level[y][x]
      #Calculate the screen x, y coordinates
      screen_x = -288 + (x * 24)
      screen_y = 288 - (y * 24)
      
      #Check if it is an X (representing a wall)
      if character == "X":
        pen.goto(screen_x, screen_y)
        
        pen.stamp()
        walls.append((screen_x,screen_y))
        
      if character == "P":
        player.goto(screen_x, screen_y)
        
      if character == "Y":
        planets.append(Planet(screen_x, screen_y))
    
      if character == "O":
        obstacles.append(Obstacle(screen_x,screen_y))                                  
                                
        
#Create class instances
pen = Pen()
player=Player()

# Walls
walls=[]
print(walls)

#Set up the level
setup_maze(levels[1])
print(walls)


#Keyboard Binding
turtle.listen()
turtle.onkey(player.go_left,"Left")
turtle.onkey(player.go_right,"Right")
turtle.onkey(player.go_up,"Up")
turtle.onkey(player.go_down,"Down")


#Turn off screen upates
wn.tracer(0)
for obstacle in obstacles:
    turtle.ontimer(obstacle.move,t=250)
#Main Game Loop
while True:
  # Update Screen
    for planet in planets:
        if player.collide(planet):
            player.planet += planet.planet
            print("Player Points : {}".format(player.planet))
            planet.destroy()
            planets.remove(planet)
    for obstacle in obstacles:
        if player.collide(obstacle):
            print("Dead")
    
    wn.update()






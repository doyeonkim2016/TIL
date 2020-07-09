Amazon S3 is secure by default; when you create a bucket or object in Amazon S3, only you
have access. To allow you to give controlled access to others, Amazon S3 provides both
coarse-grained access controls (Amazon S3 Access Control Lists [ACLs]), and fine-grained
access controls (Amazon S3 bucket policies, AWS Identity and Access Management [IAM]
policies, and query-string authentication).
Amazon S3 ACLs allow you to grant certain coarse-grained permissions: READ, WRITE, or
FULL-CONTROL at the object or bucket level. ACLs are a legacy access control mechanism,
created before IAM existed. ACLs are best used today for a limited set of use cases, such as
enabling bucket logging or making a bucket that hosts a static website be world-readable.
Amazon S3 bucket policies are the recommended access control mechanism for Amazon S3
and provide much finer-grained control. Amazon S3 bucket policies are very similar to IAM
policies, which were discussed in Chapter 6, “AWS Identity and Access Management (IAM),”
but are subtly different in that:
They are associated with the bucket resource instead of an IAM principal.
They include an explicit reference to the IAM principal in the policy. This principal can
be associated with a different AWS account, so Amazon S3 bucket policies allow you to
assign cross-account access to Amazon S3 resources.
Using an Amazon S3 bucket policy, you can specify who can access the bucket, from where
(by Classless Inter-Domain Routing [CIDR] block or IP address), and during what time of
day.
Finally, IAM policies may be associated directly with IAM principals that grant access to an
Amazon S3 bucket, just as it can grant access to any AWS service and resource. Obviously,
you can only assign IAM policies to principals in AWS accounts that you contro

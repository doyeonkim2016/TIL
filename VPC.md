Amazon VPC is the networking layer for Amazon Elastic Compute Cloud (Amazon EC2), and
it allows you to build your own virtual network within AWS. You control various aspects of
your Amazon VPC, including selecting your own IP address range; creating your own subnets;
and configuring your own route tables, network gateways, and security settings. Within a
region, you can create multiple Amazon VPCs, and each Amazon VPC is logically isolated
even if it shares its IP address space.
When you create an Amazon VPC, you must specify the IPv4 address range by choosing a
Classless Inter-Domain Routing (CIDR) block, such as 10.0.0.0/16. The address range of the
Amazon VPC cannot be changed after the Amazon VPC is created. An Amazon VPC address
range may be as large as /16 (65,536 available addresses) or as small as /28 (16 available
addresses) and should not overlap any other network with which they are to be connected.
The Amazon VPC service was released after the Amazon EC2 service; because of this, there
are two different networking platforms available within AWS: EC2-Classic and EC2-VPC.
Amazon EC2 originally launched with a single, flat network shared with other AWS
customers called EC2-Classic. As such, AWS accounts created prior to the arrival of the
Amazon VPC service can launch instances into the EC2-Classic network and EC2-VPC. AWS
accounts created after December 2013 only support launching instances using EC2-VPC. AWS
accounts that support EC2-VPC will have a default VPC created in each region with a default
subnet created in each Availability Zone. The assigned CIDR block of the VPC will be
172.31.0.0/16.

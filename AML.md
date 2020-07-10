Amazon Machine Images (AMIs)
The Amazon Machine Image (AMI) defines the initial software that will be on an instance
when it is launched. An AMI defines every aspect of the software state at instance launch,
including:
The Operating System (OS) and its configuration
The initial state of any patches
Application or system software
All AMIs are based on x86 OSs, either Linux or Windows.
There are four sources of AMIs:
Published by AWS—AWS publishes AMIs with versions of many different OSs, both
Linux and Windows. These include multiple distributions of Linux (including Ubuntu,
Red Hat, and Amazon’s own distribution) and Windows 2008 and Windows 2012.
Launching an instance based on one of these AMIs will result in the default OS settings,
similar to installing an OS from the standard OS ISO image. As with any OS installation,
you should immediately apply all appropriate patches upon launch.
The AWS Marketplace—AWS Marketplace is an online store that helps customers
find, buy, and immediately start using the software and services that run on Amazon
EC2. Many AWS partners have made their software available in the AWS Marketplace.
This provides two benefits: the customer does not need to install the software, and the
license agreement is appropriate for the cloud. Instances launched from an AWS
Marketplace AMI incur the standard hourly cost of the instance type plus an additional
per-hour charge for the additional software (some open-source AWS Marketplace
packages have no additional software charge).
Generated from Existing Instances—An AMI can be created from an existing
Amazon EC2 instance. This is a very common source of AMIs. Customers launch an
instance from a published AMI, and then the instance is configured to meet all the
customer’s corporate standards for updates, management, security, and so on. An AMI is
then generated from the configured instance and used to generate all instances of that
OS. In this way, all new instances follow the corporate standard and it is more difficult
for individual projects to launch non-conforming instances.

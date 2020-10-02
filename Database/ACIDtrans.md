#SQL ACID transaction

ACID properties define SQL database key properties to ensure consistent, safe and robust database modification when saved.

ACID stands for <b>Atomic,Consistent,Isolation, and Durability</b>

<b>Atomic</b>- Transaction acting on several pieces of information complete only if all pieces successfully sasve.Here, all or nothing applies to the transaction

<b>Consistent</b>- The saved data cannot violate the integrity of the database. Interrupted modifications sare rolled back to ensure the databse is in a state before the change takes place.

<b>Isolation</b>- No other transactions take place and affect the transaction in question. This prevents "mid-air collisions"

<b>Durable</b> - System failures or restarts do not affect committed transactions.


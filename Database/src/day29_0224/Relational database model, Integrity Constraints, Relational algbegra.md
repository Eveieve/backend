## Relational database model

## Defining jargons
Tuple
Relation Schema
Relation Instance
Attributes
Domain

Relation:
reational data model
relational database
relational algebra
relationship

## Characteristics of a Relation

1.
2. 
3. Entries in a column are from the same domain. 
4. Order of rows and columns doesn't matter. 
The rows and columns in a relation have no inherent order. You can rearrange them without changing the meaning of the data. 

A relationo is a set,  not a list, so the focus is on the data itself, not its position. 
5. Each cell contains a single value. (Atomicity)


## Integrity constraints in the relational data model

Integrity constraints are rules enforced in a relational database to ensure the accuracy, consistency, and reliability of the data. They protect the database from invalid data entries and maintain logical relationships between tables.

There are three primary types of integrity constraints: domain integrity, entity integrity, and referential integrity.

1. Domain integrity

Domain integrity ensures that the values in a column (attribute) adhere to the defined data type and allowable range (domain). Only valid data that fits the column's specification can be entered. Domain integrity is enforced through data types (e.g., INT, VARCHAR) or CHECK constraints in the database.

2. Entity integrity

Entity integrity guarantees that each row (record) in a table is uniquely identifiable. It is enforced by defining a PRIMARY KEY constraint. PRIMARY KEY value must be unique across all rows in the table and it cannot be NULL (empty).

3. Referential integrity

Referential integrity ensures that relationships between tables remain consistent via the use of foreign keys. A foreign key value in one table must either match an existing primary key value in the referenced table or be null.

### What happens if the primary key is deleted or updated?

The foreign key relies on the primary key to link the tables, so if the primary key is deleted or updated, the database has to decide what to do with the foriegn key to stay consistent, meaning the data still making sense after the change.There are 3 options you can choose to enforce data consistency.

1. Restrict deletion or update


## Why are these rules important

When designing a relational database, it's important to maintain these integrities for data reliability and consistency. 

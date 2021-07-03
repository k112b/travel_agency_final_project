# Travel-agency-backend 

## MySQL database installation instructions.

### Step 1

Navigate to the directory containing the file `travel_agency.sql` and connect to the MySQL server using the mysql client program, e.g.
```
mysqlsh -u root -p --sql
```

### Step 2

Create the database using the `source` command:
```
source travel_agency.sql
```

### Step 3

Create user and grant access on the created database:
```
CREATE USER 'agency_user' IDENTIFIED BY 'agency_pass';
GRANT ALL on travel_agency.* TO 'agency_user';
```

Let op:

gebruik Bcrypt om password te encrypten:
https://www.browserling.com/tools/bcrypt

zet deze dan vervolgens in de database met bijv:

INSERT INTO my_users (username, password, enabled)
VALUES
('user', '$2a$10$wPHxwfsfTnOJAdgYcerBt.utdAvC24B/DWfuXfzKBSDHO0etB1ica', TRUE);

Testen met postman:

stap 1:

vraag token aan met een POST authenticate:

LET OP peter heeft rol USER en ADMIN, mag dus overal bij!!!
settings:
authorisation: Basic:
username (bijv) :peter
Password: password

POST  http://localhost:8080/authenticate

je krijgt dan in de body (van de response), een jwt terug

Deze moet je vervolgens gebruiken bij alle andere requests!!



stap 2:

bijv get admin:

settings:
authorisation: Bearer  (is jwt)
Token: vul hier de uit stap 1 gekregen jwt in

GET http://localhost:8080/admin

haal gegevens van peter op.
GET http://localhost:8080/users/peter



LET OP in AuthenticationController @Crossorigin toegevoegd





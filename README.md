## pour creer les roles et users d'une base de données x

CREATE ROLE 'user'
SUPERUSER
LOGIN
PASSWORD 'securePass1';

## pour afficher les roles
\du
ou bien
SELECT rolname FROM pg_roles;
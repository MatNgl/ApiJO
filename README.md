# TicketJO

## Documentation de l'API


#### Authentification

- **POST /api/auth/register** : Enregistrer un nouvel utilisateur.
  - Request Body : 
    ```json
    {
      "username": "string",
      "password": "string",
      "role": "string"
    }
    ```
  - Response :
    ```json
    {
      "id": 1,
      "username": "string",
      "password": "string",
      "role": "string"
    }
    ```

- **POST /api/auth/login** : Connecter un utilisateur.
  - Request Body :
    ```json
    {
      "username": "string",
      "password": "string"
    }
    ```
  - Response :
    ```json
    {
      "id": 1,
      "username": "string",
      "password": "string",
      "role": "string"
    }
    ```

#### Utilisateurs

- **GET /api/users/{id}** : Obtenir un utilisateur par ID.
  - Response :
    ```json
    {
      "id": 1,
      "username": "string",
      "password": "string",
      "role": "string"
    }
    ```

#### Événements

- **POST /api/events** : Créer un nouvel événement.
  - Request Body :
    ```json
    {
      "name": "string",
      "date": "YYYY-MM-DD",
      "status": "string",
      "stadium": {
        "id": 1
      }
    }
    ```
  - Response :
    ```json
    {
      "id": 1,
      "name": "string",
      "date": "YYYY-MM-DD",
      "status": "string",
      "stadium": {
        "id": 1,
        "name": "string",
        "capacity": 10000
      }
    }
    ```

- **GET /api/events** : Obtenir tous les événements.
  - Response :
    ```json
    [
      {
        "id": 1,
        "name": "string",
        "date": "YYYY-MM-DD",
        "status": "string",
        "stadium": {
          "id": 1,
          "name": "string",
          "capacity": 10000
        }
      }
    ]
    ```

- **GET /api/events/{id}** : Obtenir un événement par ID.
  - Response :
    ```json
    {
      "id": 1,
      "name": "string",
      "date": "YYYY-MM-DD",
      "status": "string",
      "stadium": {
        "id": 1,
        "name": "string",
        "capacity": 10000
      }
    }
    ```

- **DELETE /api/events/{id}** : Supprimer un événement par ID.

#### Billets

- **POST /api/tickets** : Créer un nouveau billet.
  - Request Body :
    ```json
    {
      "quantity": 1,
      "price": 100.0,
      "isDiscounted": false,
      "user": {
        "id": 1
      },
      "event": {
        "id": 1
      }
    }
    ```
  - Response :
    ```json
    {
      "id": 1,
      "quantity": 1,
      "price": 100.0,
      "isDiscounted": false,
      "user": {
        "id": 1,
        "username": "string"
      },
      "event": {
        "id": 1,
        "name": "string"
      }
    }
    ```

- **GET /api/tickets** : Obtenir tous les billets.
  - Response :
    ```json
    [
      {
        "id": 1,
        "quantity": 1,
        "price": 100.0,
        "isDiscounted": false,
        "user": {
          "id": 1,
          "username": "string"
        },
        "event": {
          "id": 1,
          "name": "string"
        }
      }
    ]
    ```

- **GET /api/tickets/{id}** : Obtenir un billet par ID.
  - Response :
    ```json
    {
      "id": 1,
      "quantity": 1,
      "price": 100.0,
      "isDiscounted": false,
      "user": {
        "id": 1,
        "username": "string"
      },
      "event": {
        "id": 1,
        "name": "string"
      }
    }
    ```

- **DELETE /api/tickets/{id}** : Supprimer un billet par ID.

#### Administration

- **POST /api/admin/events** : Créer un nouvel événement.
  - Request Body :
    ```json
    {
      "name": "string",
      "date": "YYYY-MM-DD",
      "status": "string",
      "stadium": {
        "id": 1
      }
    }
    ```
  - Response :
    ```json
    {
      "id": 1,
      "name": "string",
      "date": "YYYY-MM-DD",
      "status": "string",
      "stadium": {
        "id": 1,
        "name": "string",
        "capacity": 10000
      }
    }
    ```

- **PUT /api/admin/events/{id}/open** : Ouvrir la réservation d'un événement.
  - Response :
    ```json
    {
      "id": 1,
      "name": "string",
      "date": "YYYY-MM-DD",
      "status": "OPEN",
      "stadium": {
        "id": 1,
        "name": "string",
        "capacity": 10000
      }
    }
    ```

- **PUT /api/admin/events/{id}/close** : Fermer la réservation d'un événement.
  - Response :
    ```json
    {
      "id": 1,
      "name": "string",
      "date": "YYYY-MM-DD",
      "status": "CLOSED",
      "stadium": {
        "id": 1,
        "name": "string",
        "capacity": 10000
      }
    }
    ```

- **PUT /api/admin/events/{id}/postpone** : Reporter un événement.
  - Request Param : `newDate=YYYY-MM-DD`
  - Response :
    ```json
    {
      "id": 1,
      "name": "string",
      "date": "YYYY-MM-DD",
      "status": "POSTPONED",
      "stadium": {
        "id": 1,
        "name": "string",
        "capacity": 10000
      }
    }
    ```

- **DELETE /api/admin/events/{id}** : Annuler un événement.

# anpr-service

Servizio per interrogare anpr
Non è stato possibile adeguare il microservizio con spring boot 3 perchè l'aggiornamento del plugin cfx genera un errore nella creazione dei file da wsdl.
La soluzione è stata quella di aggiornare la sola versione di lombok e buildarlo con java 21.

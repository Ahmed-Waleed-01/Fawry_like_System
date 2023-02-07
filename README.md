# Fawry_like_System (Built with JAVA) (Design patterns and Solid principles are applied, with meaningful variables names)
----------------------------------------------------------------------------
The initial services are:

a. Mobile recharge services.
  i. Vodafone
  ii. Etisalat
  iii. Orange
  iv. We
  
b. Internet Payment services.
  i. Vodafone
  ii. Etisalat
  iii. Orange
  iv. We
  
c. Landline services
  i. Monthly receipt
  ii. Quarter receipt
  
d. Donations
  i. Cancer Hospital
  ii. Schools
  iii. NGOs (Non profitable organizations)

----------------------------------------------------------------------------
Project Requirements:

User side:

1. The user should be able to sign-in to the system. Given the user’s email and a
password, the user can login to the system and use any of the system functionalities.

2. The user should be able to sign up to the system. The user should provide his email and password.
The system should check if the username or the email is registered before,
if they are not registered before then the signup process should complete successfully, if not, the system will show an error to the user.

3. The user is able to search for any service in the system. The user can type the
service name and the system will function if it exists.

4. The user can pay for any service in the system using 3 ways (Credit card, Cash, Wallet).

5. The user can ask for a refund for any complete transaction to any given service. The
refund request will be issued by the user and sent to the admin. If the admin approves
the refund then the refund process should complete successfully.

6. The system maintain a wallet balance for each user. The user should be able to add any
funds to the wallet. Adding funds to the wallet should be done via credit card.

7. The user should be able to get any discount for any service in the system if it applies to the user conditions. Discounts
could be added by the admin.

----------------------------------------------------------------------------
Admin side:

1. The admin should be able to add discounts to the system. There are two types of
discounts:
a. First time discounts. For example the user should have 10% discount for the first
transaction (regardless the service) (admin can change the precentages, default is 0%).
b. Specific discount.. For example the admin can apply 20% discount for all mobile
recharge services.
For any given service. All first time discounts and specific discounts for this service should
apply.

2. The admin is able to list all refund requests. Each refund request contains
the related service and the amount to be refunded. The admin is able to accept
or reject any refund request and if any refund request got accepted a refund transaction
is processed.

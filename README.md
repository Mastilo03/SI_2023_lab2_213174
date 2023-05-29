# Втора лабораториска вежба по Софтверско инженерство
## Филип Гацов 213174
### Control Flow Graph
![CFG](https://github.com/Mastilo03/SI_2023_lab2_213174/assets/94940105/38070f73-5b98-47c4-af20-f64bd7c87833)
### Цикломатска комплексност
Цикломатската комплексност на овој код е 11, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=10, па цикломатската комплексност изнесува 11.
### Тест случаи според критериумот Every Бranch
Тест 1: 
User(username:"Gacov02",password:"password*123",email:"gacov@gmail.com"),
allUsers={User(username:"Gacov02",password:"password*123",email:"gacov@gmail.com"),
User(username:"User1",password:"password#123",email:"user1@gmail.com")}
- User кои постои во листата со валиден username, password со спрецијални знаци и повеќе од 8 карактери и валиден email;

Тест 2: 
User= null
allUsers={User(username:"Gacov02",password:"password*123",email:"gacov@gmail.com"),
User(username:"user1",password:"password#123",email:"user1@gmail.com")}
- Нема user(user е null);

Тест 3: 
User(username: null,password:"pass",email:"usergmail.com")
allUsers={User(username:"Gacov02",password:"password*123",email:"gacov@gmail.com"),
User(username:"user1",password:"password#123",email:"user1@gmail.com")}
- User нема username и маилот нема @;

Тест 4: 
User(username: null,password:"pa ss",email:"usergmail.com")
allUsers={User(username:"Gacov02",password:"password*123",email:"gacov@gmail.com"),
User(username:"user1",password:"password#123",email:"user1@gmail.com")}
- password има празно место ;

Тест 5: 
User(username: null,password:"password123",email:"usergmail.com")
allUsers={User(username:"Gacov02",password:"password*123",email:"gacov@gmail.com"),
User(username:"user1",password:"password#123",email:"user1@gmail.com")}
- User неговиот pаssword не содржи специјален знак; 

### Тест случаи според критериумот Multiple Condition
Multiple Condition
1. TXX -> user==null
- userot e null, тоа значи нема password и email и не се битни;
2. FTX -> user !=null,password==null
- Userot не е null, password е null и email  не е битен;
3. FFT -> user!=null,password!=null,email==null
- User и password не се  null, email e null;
4. FFF -> user!=null,password!=null,email!=null
- User, password и email не се null;




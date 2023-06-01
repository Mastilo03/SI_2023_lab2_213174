# Втора лабораториска вежба по Софтверско инженерство
## Филип Гацов 213174
### Control Flow Graph
![CFG](https://github.com/Mastilo03/SI_2023_lab2_213174/assets/94940105/40b4cbd7-c7b1-4af1-8876-2b9def48b998)

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
User(username: null,password:"pa ssword",email:"usergmail.com")
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

Објаснување на unit tests:
Во тест случаите се користи следната листа од постоечки корисници.
 List<User> allUsers = new ArrayList<>();
        allUsers.add(new User("Gacov02","password*123","gacov@gmail.com"));
        allUsers.add(new User("User1","password#123","user@gmail.com"));

Во тест функцијата testEveryBranch() има 5 assertions.

1. assertFalse(SILab2.function(new User("Gacov02","password*123","gacov@gmail.com"),allUsers));
Овој асерт го покрива првиот тест случај. Потребно е да врати false, бидејќи user постои во листата.

2.  ex= assertThrows(RuntimeException.class, () -> SILab2.function(null,allUsers));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
Овие asserts го покриваат вториот тест случај. Со првиот assert очекуваме функцијата да врати exception, бидејќи user е null, а потоа со вториот assert да провериме дали тоа е соодветниот exception.

3.  assertFalse(SILab2.function(new User(null,"pass","usergmail.com"),allUsers));
Овој assert го покрива третиот тест случај. Очекуваме false, бидејќи passwoer е помал од 8 карактери, а email не содржи @ и .

4. assertFalse(SILab2.function(new User(null,"pa ssword","usergmail.com"),allUsers));
Овој assert го покрива четвртиот тест случај. Очекуваме false, бидејќи password има празно место.

5. assertFalse(SILab2.function(new User(null,"password123","usergmail.com"),allUsers));
Овој assert го покрива петтиот тест случај. Очекуваме false, бидејќи password нема специјален знак.

Во тест функцијата testMultipleCondition() има 4 assertions.

1.  ex= assertThrows(RuntimeException.class, () -> SILab2.function(null,allUsers));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
Овие asserts го покриваат првиот тест случај. Со првиот assert очекуваме функцијата да врати exception, односно условот е true, бидејќи user е null, а со вториот assert проверуваме дали е соодветниот exception.

2.   ex= assertThrows(RuntimeException.class, () -> SILab2.function(new User("username",null,"email"),allUsers));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
Овие asserts го покриваат вториот тест случај. Со првиот assert очекуваме функцијата да врати exception, односно условот е true, бидејќи password е null, а со вториот assert проверуваме дали е соодветниот exception.

3.  ex= assertThrows(RuntimeException.class, () -> SILab2.function(new User("username","password",null),allUsers));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
Овие asserts го покриваат третиот тест случај. Со првиот assert очекуваме функцијата да врати exception, односно условот е true, бидејќи email е null, а со вториот assert проверуваме дали е соодветниот exception.

4.  assertFalse(SILab2.function(new User("username","password","email"),allUsers));
Овој assert го покрива четвртиот тест случај. Очекуваме да не фрли exception, односно условот е false и текот на програмата продолжува понатаму.





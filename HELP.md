# Analyze FX deals

FX deals is a spring boot project to accept deals details from and persist them into DB

## Getting Started


 

### Prerequisites

 IDE : Intellij

 java 11 kit
 
  Control Panel : XAMPP v3.2.4 
  
should be 3306:mysql port in xampp

 

### Installing

Class main to run project

```
@SpringBootApplication
@EnableSwagger2
public class DealsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DealsApplication.class, args);
    }

```


And to test
```

@RunWith(SpringJUnit4ClassRunner.class)
public class Dealsdeteils {

    private MockMvc mockMvc;

    @Test
    public void testPost() throws Exception {

```
 

 after running may can viest swagger for Api Documentation in this link 
 http://localhost:8080/swagger-ui.html
                                         
 



## Deployment

//

## Built With

* [Spring boot](https://spring.io/projects/spring-boot) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [swagger](https://swagger.io/) - Used to Api Documentation
                                           



## Versioning

 spring-boot 2.5.6
 
  java  11 
  
  mysql-connector 8.0.19
  
  swagger 2.9.2
  
  mockito-core 3.11.2

## Authors

* **yazan abuawwad** - *Java developer* - [GITHUB](https://github.com/Yazan-Abuawwad)

 
 
 

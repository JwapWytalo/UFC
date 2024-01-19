
  int led1 = 10;
  int led2 = 9;
  int x;

void setup(){

 pinMode(led1, OUTPUT);
 pinMode(led1, INPUT);

 pinMode(led2, OUTPUT);
 pinMode(led2, INPUT);

}


void loop()
{
Serial . begin (9600) ;
Serial . setTimeout (3000) ;
Serial . println (" digite: ") ;
x = Serial . parseInt () ;

  if(x == 1){
    
    digitalWrite(led1, HIGH);
    digitalWrite(led2, LOW);
    
   
    }else if(x == 0){
      
      digitalWrite(led2, HIGH);
      digitalWrite(led1, LOW);
    	
  }
 
}
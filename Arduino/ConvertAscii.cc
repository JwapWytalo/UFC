void setup(){
  
  Serial.begin(115200);
  
pinMode(13, OUTPUT);

  pinMode(12, OUTPUT);
  
  pinMode(11, OUTPUT);
  
  pinMode(10, OUTPUT);
  
  pinMode(8, OUTPUT);
  
  pinMode(7, OUTPUT);

  pinMode(6, OUTPUT);
  
  
}

void loop(){
  
  char x;
  
  Serial.println("Digita: ");
  x = Serial.read();
  
  if(x == 'A'){
    
    //A == 01000001
  
    digitalWrite(13, LOW);
    digitalWrite(12, HIGH);
        digitalWrite(11, LOW);
        digitalWrite(10, LOW);
        digitalWrite(9, LOW);
        digitalWrite(8, LOW);
        digitalWrite(7, LOW);
    	digitalWrite(6, HIGH);
    
  }else if(x == 'a'){
  
    //a==   01100001
    
    digitalWrite(13, LOW);
    digitalWrite(12, HIGH);
        digitalWrite(11, HIGH);
        digitalWrite(10, LOW);
        digitalWrite(9, LOW);
        digitalWrite(8, LOW);
        digitalWrite(7, LOW);
    	digitalWrite(6, HIGH);
    
  }
    
  	delay(5000);
  
  }
  
  
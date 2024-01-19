int led = 7;
int button = 10;
boolean toogle = false;
void setup()
{
 	pinMode(led, OUTPUT);
 	pinMode(button, INPUT);
}
void loop()
{
	 if(toogle)
 {
 	digitalWrite(led, LOW);
 }

 if(digitalRead(button)){
	 toogle = true;
 while(digitalRead(button))
{ 
 	digitalWrite(led, HIGH);
 		}
	}
}
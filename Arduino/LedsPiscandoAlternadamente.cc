
void setup()
{
  pinMode(10, OUTPUT);
  pinMode(6, OUTPUT);
}

void loop()
{
  digitalWrite(10, HIGH);
  delay(1000);
  digitalWrite(10, LOW);
  delay(1000);
  
  digitalWrite(6, HIGH);
  delay(1000);
  digitalWrite(6, LOW);
  delay(1000); 
  
}
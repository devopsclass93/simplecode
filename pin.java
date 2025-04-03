echo "Please enter your pin" 
read pin 
if [ $pin == 2077 ]
then 
echo "You entered the correct pin"  
echo "Welcome to TDBank, how can we help"
else  
echo "You failed authentication"
echo "Please you have 2 more chances to enter the correct pin"
fi 

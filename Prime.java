class Prime {

    public static void main(String[] args) {

        String num1= args[0];
		int num = Integer.parseInt(num1);
        boolean result = false;
		if (num > 1){
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                result = true;
                break;
            }
        }}
		else
		{ result = true;}

        if (result == false)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}

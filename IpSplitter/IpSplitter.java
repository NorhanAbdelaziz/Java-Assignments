class IpSplitter {
public static void main (String [] args)
{

	int start = 0;
	int end = args[0].indexOf(".");
	System.out.println(args[0].substring(start,end));
	
	while(end != -1){
		start = end + 1;
		end = args[0].indexOf(".", start);
		if(end == -1) break;
		System.out.println(args[0].substring(start,end));
	}
	System.out.println(args[0].substring(start));

}
}
	
	
	/*
	192.168.1.1
	substring  ==>   [ , )   abcde  sbstr(1,3) ==> bc  <== String
	
	indexOf 	==>	index => int 
	
	
	192.168.1.1    
	
	start	end
	0		3
	3		7
	7		9
	10		-1
	
	
	*/
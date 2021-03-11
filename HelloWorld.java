class HelloWorld 
{ 
    public float getFinalAmount(float p,float r,float t)
    {
       float Amount;
       Amount = p*( 1 + (r*t));
       return Amount; 
    }
    public float getSimpleInterest(float p,float r,float t){
        float simpleInterest;
        simpleInterest = (p * r * t) / 100;
        return simpleInterest;
    }

    public static void main(String args[]) 
    {
        float p,r,t;
        p = 100;
        r = 10;
        t = 2;
        System.out.print("S_Interest is : ");
        System.out.println(getSimpleInterest(p,r,t)); 
        System.out.print("Final Amount is : ");
        System.out.println(getFinalAmount(p,r,t)); 
    } 
} 
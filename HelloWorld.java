class HelloWorld 
{
    public float getSimpleInterest(float p,float r,float t){
        float simpleInterest;
<<<<<<< HEAD
        simpleInterest = (p * r * t) / 100;
=======
        sinterest = (p * r * t) / 100;
>>>>>>> be10e231d0bef072594bf0d51ad5090ca8b1fc24
        return simpleInterest;
    }

    public static void main(String args[]) 
    {
        float p,r,t;
        p = 100;
        r = 10;
        t = 10;
        System.out.print("S_Interest is : ");
        System.out.println(getSimpleInterest(p,r,t)); 
    } 

} 
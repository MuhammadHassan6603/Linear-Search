class LinearSearch
{
    public static void main(String args[])
    {
        int arr[]=new int[args.length];
        int index=-1;
        int key=20;
        boolean b=true;
        for(int i=0;i<args.length;i++)
        {
            arr[i]=Integer.parseInt(args[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==20)
            {
                index=i;
                b=true;
                System.out.println("Search is Successful");
                System.out.print("Value is at Index = " + index + "\n Value is = " + key);
                break;
            }
            if(b==false)
            {
                System.out.println("Search not Successful");
            }
        }
    }
}
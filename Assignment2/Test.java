class Test
{
    static void ReserveName(String name) throws RojinaException
    {
        if(name == "Rojina")
        {
            throw new RojinaException("NameIsReserved");
        }else{
            System.out.println("You can use this name.");
        }
    }

    public static void main(String[] args) {
        try {
           ReserveName("Rojina");
        } 
        catch (RojinaException e) {
            System.out.println("You cannot reserve this name. " + e);
        }
    }
    
}
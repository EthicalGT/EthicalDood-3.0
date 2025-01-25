
class senmailex{
    public static void main(String[] args) {
        try{
            Email email=new Email("bhaskartelore@gmail.com","yashtirtha");
            email.setFrom("bhaskartelore@gmail.com","EthicalDood Team");
            email.setSubject("Test Email");
            email.setContent("<h1>Hello i am GT","text/html");
            email.addRecipient("rorystarlight@gmail.com");
            email.send();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
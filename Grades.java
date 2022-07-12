import java.io.*;
import java.util.*;

class Grades 
{
    public static void main(String[] args) throws Exception
    {
        Scanner conIn = new Scanner(System.in);
        String filename;
        
        System.out.println("give me the name of the file");
        filename = conIn.nextLine();
        File file=new File(filename);
        float vathmos,poso=0,telikosvathmos=0;
        try{
            
            List<String> list=new ArrayList<String>();
           
            List<Float> lista=new ArrayList<Float>();
            Scanner sc= new Scanner(file);
            String AM=sc.next();
            
            String end="000000",end1="end";
           
            while(!AM.equals(end)) 
            {
                String next=sc.next(); 
                
                while(!next.equals(end1))
                {
                    
                    vathmos=sc.nextFloat();
                    
                    poso=poso+1;
                    
                    telikosvathmos=vathmos+telikosvathmos;
                    next=sc.next();
                    

                }
                
                if(poso!=0)
                {    
                    lista.add(telikosvathmos/poso);
                }
                else
                {
                    float n=0;
                    lista.add(n);
                }
               
                telikosvathmos=0;
                poso=0;
                
                list.add(AM);
                
                AM = sc.next();   
            }
            
            for(int i=0; i<list.size(); i++)
            {
                System.out.println("Arithmos Mitroou: "+list.get(i)+" Mesos Oros: "+lista.get(i));
            }
            
            conIn.close();
            sc.close();
            
        } catch (Exception e) {
            System.out.println("Bye\n");
        }
    }
}

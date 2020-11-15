/*
Artist.Java
Vince Forrester
Artist Class of Media Library Application
11/08/2020
 */

package mediali;

import java.util.Scanner;
import java.io.IOException;

public class Artist {
    
private String first;
private String last;
private Date birthDate=new Date();
private String twitterHandle;
private String url;

private Boolean go;

Scanner sc1 = new Scanner(System.in);

public Artist (String f, String l,Date bD,String tH,String u)
{
  first=f;
  last=l;
  birthDate=bD;
  twitterHandle=tH;
  url=u;   
}

//Constructors

public Artist (String f, String l,Date bD,String u)
{
  first=f;
  last=l;
  birthDate=bD;
  twitterHandle="";
  url=u;
}



public Artist ()
{
System.out.println("Artist Entry");

System.out.print("First Name:");  
first=sc1.nextLine();


System.out.print("Last Name:");
last=sc1.nextLine();

go=false;

while (!go)
{try
{
    System.out.println("Date of Birth(mm/dd/yyyy):");
    birthDate.getDate();
    go=true;
}
    catch (Exception ex)
{
    System.out.println(ex.getMessage());
    System.err.println(ex);
    go=false;
    System.out.println("Illegal value entered please re-enter");
}
}                 
                   
                   
                   
                   
System.out.print("Twitter Handle:");
twitterHandle=sc1.next();

System.out.print("URL:");
url=sc1.next();
        
        
}


        
//accessors

public String getFirst()
{
    return first;
}
        
        
public String getLast()
{
    return last;
}


        
public Date getBirthDate()
{
    return birthDate;
}

public String getTwitterHandle()
{
    return twitterHandle;
}
        
public String getUrl()
{
    return url;
}

public String toString()
{
    return "Name: " + first + " " + last + "\nBirthdate: " + birthDate +"\ntwitterHandle: "+twitterHandle+"\nURL: "+url + "\n\n";
}
  
//make equals on last & first name and dob so user won't have to enter in everything every time 
public boolean equals(Artist a1)
    {
     return ( birthDate.equals(a1.getBirthDate()) && last.equals(a1.getLast()) && first.equals(a1.getFirst())&& url.equals(a1.getUrl())&& twitterHandle.equals(a1.getTwitterHandle()));
    }
    
}

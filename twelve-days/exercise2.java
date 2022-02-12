class TwelveDays 
    {
         String attach="";
         int j=0;
        
        String []days={"first","second","third","forth","fifth","sixth","seventh","eight","ninth","tenth","eleventh","twelth"};
        String []lyrics ={"a Partridge in a Pear Tree.",
                         "two Turtle Doves, ",
                         "three French Hens, ",
                         "four Calling Birds, ",
                         "five Gold Rings, ",
                         "six Geese-a-Laying, ",
                         "seven Swans-a-Swimming, ",
                         "eight Maids-a-Milking, ",
                          "nine Ladies Dancing, ",
                          "ten Lords-a-Leaping, ",
                          "eleven Pipers Piping, ",
                          "twelve Drummers Drumming, "};  
                for(int i=0;i<12;i++)
                {
                if(i==0)
                {
                System.out.println("On the "+days[i]+" day of Christmas my true love gave to me: "+lyrics[i]);
                }               
                else if(i>0)
                {
                    j=i;
                    if(j==1)
                    {
                    attach="and "+lyrics[j-1]+attach;
                    }
                    else
                    {
                        attach=lyrics[j-1]+attach;
                    }
                 System.out.println("On the "+days[i]+" day of Christmas my true love gave to me: "+lyrics[i]+attach);
                }                                                
            }
            }
    


package Collection;

public class Songs implements Comparable<Songs>
{
	String singer;
	String song;
	int rank;
   public Songs(String singer,String song,int rank)
   {
	   this.singer=singer;
	   this.song=song;
	   this.rank=rank;
   }
   
   @Override
   public String toString()
   {
	   return "Singer ="+singer+" and song ="+song+" Rank is "+rank;
   }
   
//   @Override //for String comparision
//   public int compareTo(Songs s)
//   {
//	   return this.singer.compareTo(s.singer);
//   }
   
   @Override
   public int compareTo(Songs s)
   {
	   if(this.rank>s.rank)
	   {
		   return 1;
	   }
	   else if(this.rank<s.rank)
	   {
		   return -1;
	   }
	   else {
		   return 0;
	   }
   }
   
}

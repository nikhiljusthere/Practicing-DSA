//  Operating an array
//  https://www.geeksforgeeks.org/problems/operating-an-array/1

class GfG
{		
	public boolean searchEle(List<Integer> a,int x)
       {
		return a.contains(x);
	}
	public boolean insertEle(List<Integer> a,int y,int yi)
        {
              if(yi >= 0 && yi < a.size()) {
                  a.add(yi, y);
                  return true;
              }		
              return false;
	}
	public boolean deleteEle(List<Integer> a,int z)
        {
		for (int i=0; i < a.size(); i++) {
		    if(a.get(i) == z){
		        a.remove(i);
		        return true;
		    }
		}
		return false;
	}
}

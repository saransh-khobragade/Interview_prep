import java.io.*;
class MakeArrayEqualBy1
{

	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(sc.readLine());
		int op = 0;
		for(int i = 0; i < t; i++){
		    int size = Integer.parseInt(sc.readLine());
        String[] salary = sc.readLine().split(" ");
		    while(true) {
          int max = 0;
          int max2 = -1;
					int j = 1;
          for(j = 1; j <= size/2; j++){
							int rev = size - j - 1;
							if(Integer.parseInt(salary[max]) <= Integer.parseInt(salary[rev]))
                max = rev;
							else
								max2 = rev;
              if(Integer.parseInt(salary[max]) <= Integer.parseInt(salary[j]))
                max = j;
							else
								max2 = j;
          }
					if(max2 == -1)
						break;
					else
						op++;
          for(j = 0; j < size/2; j++){
            if(j != max)
              salary[j] = (Integer.parseInt(salary[j]) + 1) + "";
						int rev = size - j - 1;
						if(rev != max)
							salary[rev] = (Integer.parseInt(salary[rev]) + 1) + "";
          }
					if(size % 2 != 0 && j != max)
						salary[j] = (Integer.parseInt(salary[j]) + 1) + "";
        }
		    System.out.println(op);
		}
		sc.close();
	}
}

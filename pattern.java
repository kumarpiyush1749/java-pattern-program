package MAY;

public class pattern {

	public static void main(String[] args) 
	{
		/*for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=5;j++)
			{
			  System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		int k=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print( k);
				k++;
			}
			System.out.println();
		}
		int k=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print( k);
				k=k+2;
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print( i*j);
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(j+""+i+"");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(i+""+j+"");
			}
			System.out.println();
		}
		int k;
		for(int i=1;i<=5;i++)
		{
			k=i;
			for(int j=1;j<=5;j++)
			{
				System.out.print( k);
				k+=5;
			}
			System.out.println();
		}
		int x,y;
		int n=5;
		for(int i=1;i<=n;i++)
		{
			x=i;
			y=n-i+1;
			for(int j=1;j<=n;j++)
			{
				if(j%2==1)
				{
					System.out.print(x);
				}
				else
				{
					System.out.print(y);
				}
				x=x+n;
				y=y+n;
			}
			System.out.println();
		}
		int n=5;
		int x;
		for(int i=1;i<=n;i++)
		{
			x=n-i+1;
			for(int j=1;j<=n;j++)
			{
				System.out.print(x);
				x=x+n;
			}
			System.out.println();
		}
		int n=5;
		int x,y;
		for(int i=1;i<=n;i++)
		{
			x=i;
			y=n-i+1;
			for(int j=1;j<=n;j++)
			{
				if(j%2==0)
				{
					System.out.print(x);
				}
				else
				{
					System.out.print(y);
				}
				x=x+n;
				y=y+n;
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print((i+j-1)); 
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(2*(i+j)-3);
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print((i+j)%2+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<=5;j++)
			{
				System.out.print((i+j)%2+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print((i*j)%2+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<=5;j++)
			{
				System.out.print((i*j)%2+" ");
			}
			System.out.println();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i%2+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i%2+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(j%2+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(j%2+" ");
			}
			System.out.println();
		}
		for(char i='A';i<='E';i++)
		{
			for(char j='A';j<='E';j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(char i='A';i<='E';i++)
		{
			for(char j='A';j<='E';j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}	
		for(char i='E';i>='A';i--)
		{
			for(char j='A';j<='E';j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(char i='E';i>='A';i--)
		{
			for(char j='E';j>='A';j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}	
		char ch='A';
		for(char i='A';i<='E';i++)
		{
			for(char j='A';j<='E';j++)
			{
				System.out.print(ch+" ");
				//ch++;
				if(ch<'z')
				{
					ch++;
				}
				else
				{
					ch=(char)'A';
				}
			}
			System.out.println();
		}	
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print((char) (i+j+65));
				System.out.print(" ");
			}
			System.out.println();
		}
		int n=5;
		int x;
		for(int i=0;i<n;i++)
		{
			x=i;
			for(int j=1;j<=n;j++)
			{
				x+=n;
				System.out.print((char)(x-n+65)+" ");
			}
			System.out.println();
		}
		int n=5;
		int x;
		for(int i=1;i<=n;i++)
		{
			x=n-i;
			for(int j=1;j<=n;j++)
			{
				System.out.print((char)(x+65)+" ");
				x=x+n;
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(j
						+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((j*2)+" ");
			}
			System.out.println();
		}
		int n=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			int t=i-1;
			for(int j=1;j<=i;j++)
			{
				System.out.print((t+i)+" ");
				t=t+2;
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((i+j-1)+" ");
			}
			System.out.println();
		}
		int k=0;
		for(int i=1;i<=5;i++)
		{
			k=k+i;
			for(int j=k;j>k-i;j--)
			{
				System.out.print((j)+" ");
			}
			System.out.println();
		}
		int n=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(n+" ");
				n+=2;
			}
			System.out.println();
		}
		int n=2;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(n+" ");
				n+=2;
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((i*j)+" ");
			}
			System.out.println();
		}
		int n=5;
		int x=1;
		int y,t;
		for(int i=n;i>=1;i--)
		{
			y=i;
			t=x;
			for(int j=n;j>=i;j--)
			{
				System.out.print(t+" ");
				t=t-y;
				y++;
			}
			x=x+i;
			System.out.println();
		}
		int n=5;
		int x=1;
		int y=n,t1,t2,r1,r2;
		for(int i=n;i>=1;i--)
		{
			r1=i;
			r2=i+1;
			t1=x;
			t2=y;
			for(int j=n;j>=i;j--)
			{
				if((i+j)%2==0)
				{
					System.out.print(t1+" ");
				}
				else
				{
					System.out.print(t2+" ");
				}
				t1=t1-r1++;
				t2=t2-r2++;
			}
			y=y+i-1;
			x=x+i;
			System.out.println();
		}
		int n=5;
		int x=1;
		int y=n,t1,t2,r1,r2;
		for(int i=n;i>=1;i--)
		{
			r1=i;
			r2=i+1;
			t1=x;
			t2=y;
			for(int j=n;j>=i;j--)
			{
				if((i+j)%2==1)
				{
					System.out.print(t1+" ");
				}
				else
				{
					System.out.print(t2+" ");
				}
				t1=t1-r1++;
				t2=t2-r2++;
			}
			y=y+i-1;
			x=x+i;
			System.out.println();
		}
		int n=5;
		int x=(n*(n+1))/2;
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(x--+" ");
			}
			System.out.println();
		}*/
		int n=5;
		int x=n;
		int y,t;
		for(int i=n;i>=1;i--)
		{
			y=i+1;
			t=x;
			for(int j=n;j>=i;j--)
			{
				System.out.print(t+" ");
				t=t-y;
				y++;
			}
			x=x+i-1;
			System.out.println();
		}
	}
}
	

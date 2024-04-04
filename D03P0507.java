package com.learning.core.day3session1;
import java.util.Scanner;
public class D03P0507 {
	public static void main(String[] args)
	{ Scanner s=new Scanner(System.in);
	String str1=s.nextLine();
	String a[]=str1.split(" ");
	String str2=s.next();
	int n=a.length;
	int found=0;
	for(int i=0;i<n;i++)
	{ if(pat(a[i])==pat(str2))
	{ System.out.print(a[i]+" ");
	found=1;
	}
	}
	if(found==0)
	{ System.out.print("NULL");
	}
	}
	static int pat(String s)
	{ String p="";
    char ch[]=s.toCharArray();
	for(int i=0;i<s.length();i++)
	{ int c=1;
	for(int j=i+1;j<s.length();j++)
	{ if(ch[i]==ch[j] && ch[i]!='*')
	{ c++;
	ch[j]='*';
	}
	}
	if(ch[i]!='*')
	{ p=p+c;
	}
	}
	return Integer.parseInt(p);
	}
	}
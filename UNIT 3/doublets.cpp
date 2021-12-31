#include<stdio.h>
#include<iostream>
#include<string>

using namespace std;

int main(){
    string str[100];
    int n,i,j,changes=0;
    scanf("%d",&n);
    for(i=0;i<=n;i++){
        getline(cin,str[i]);
    }
    
    for(i=0;i<=n;i++){

        changes = 0;

        for(j=0;j<str[i].length();j++){

           if(str[i][j] == str[i+1][j]){
              continue;
           }else{
               changes++;
           }
        }
        cout << changes;

        if(changes == 1){
            cout << "\n" << str[i];
        }
    }

    return 0;
}

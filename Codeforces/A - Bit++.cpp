#include <iostream>
using namespace std;
int main(){
    int n ;
    string info ;
    int counter = 0;
    cin >> n ;
 
    for (int i=0 ;i<n ;i++){
        cin >> info;
 
    if(info == "X++" || info == "++X" ){
        counter += 1;
        };
    if(info == "X--" || info == "--X" ){
        counter -= 1;
        };
        
        }
        
        cout << counter ;
        }
 
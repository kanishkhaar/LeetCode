
class Solution{
public ListNode rotateRight(ListNode head,int k){
   if(head==null||head.next==null||k==0)return head;
    ListNode temp=head;
int len=1;
while(temp.next!=null){
temp=temp.next;
len++;
}
temp.next=head;
k%=len;
int steps=len-k;
while(steps-->0)temp=temp.next;
ListNode newHead=temp.next;
temp.next=null;
return newHead;
}
}

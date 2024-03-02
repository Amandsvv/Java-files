package library;

 class StatusUpdate {
    int availableCopies;
    int borrow(int availableCopies){
        if(availableCopies > 0){
            availableCopies --;
        }
        return availableCopies;
    }
    int returnBook(int availableCopies){
        if(availableCopies < 10){
            availableCopies ++;
        }
        return availableCopies;
    }
}

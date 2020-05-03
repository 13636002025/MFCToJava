package com.huaji;

public class SkyworthTelevision implements Television {
    private Object[] obj={"CCTV-1","CCTV-2","CCTV-3","CCTV-4"};
    @Override
    public TVIterator createrIterator() {
        return new SkyworthIterator();
    }
    private class SkyworthIterator implements TVIterator{

        private int currentIndex=0;
        @Override
        public void setChannel(int i) {
            currentIndex=i;
        }

        @Override
        public void next() {
            if (currentIndex<obj.length){
                currentIndex++;
            }
        }

        @Override
        public void previous() {
            if (currentIndex>0){
                currentIndex--;
            }
        }

        @Override
        public boolean isLast() {
            return currentIndex==obj.length;
        }

        @Override
        public Object currentChannel() {
            return obj[currentIndex];
        }

        @Override
        public boolean isFirst() {
            return currentIndex==0;
        }
    }
}

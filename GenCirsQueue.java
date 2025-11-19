class GenCirsQueue<T> implements IGenQ<T> {
	private int putloc, getloc;
	private T[] q;

	public GenCirsQueue(T[] aRef) {
		q = aRef;
		putloc = getloc = 0;
	}
	public void put(T obj) throws QueueFullException {
		if(putloc+1==getloc | ((putloc==q.length-1)&(getloc==0))) 
			throw new QueueFullException(q.length);
		q[putloc++] = obj;
		if(putloc==q.length)
			putloc = 0;
	}
	public T get() throws QueueEmptyException {
		if(getloc == putloc)
			getloc = 0;
		return q[getloc++];
	}
}

public class ReadWriteLock {
    
}

/*
    [READ-WRITE-LOCK]
        Used whn we want multiple threads to enter into the critical section and perform opeartion in a way that 
        if the operation is read-specifix 
        -- sharedLock -- multiple threads can enter into critical section
        if the operation is write sepecific
        -- ExclusiveLock -- only one thread can write at a time

        ReadWriteLock lock = new ReentrantReadWriteLock()
            -- Multiple readers are allowed together
            -- one writer single allowed
            -- If one write acquire the lock then no reader is allowed in the lock
            -- If one reader acquire the lock then multiple reader can acqure 
                the lock but no writer can

            Lock rl = lock.readLock(); -- it will give shared lock
            Lock wl = lock.writeLock(); -- it will give exluisve lock
*/
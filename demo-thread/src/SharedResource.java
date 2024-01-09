public class SharedResource {

  private boolean hasData = false; // Shared Resource

  // 1. both 2 thread starts at the same time
  // 2. Producer thread -> "synchronized produce()" -> acquire the lock
  // 3. Consumer thread is waiting outside the door of "synchronized consume()"
  // 4. Producer thread -> producing the data -> notify (叫醒 other threads)
  // 5. Producer thread -> wait() -> release the lock
  // 6. Consumer thread -> get the lock -> get into "synchronized consume()"

  // 1. waiting thread has to be notified by someone
  // 2. synchronized instance method can only be accessed when the thread has the key (lock)

  public synchronized void produce() throws InterruptedException {
    while (hasData) {
      System.out.println("producer -> self wait ...");
      wait();
    }
    System.out.println(
        "Thread ID:" + Thread.currentThread().getId() + ":Producing data...");
    Thread.sleep(2000); // simulate produce process...
    hasData = true;
    System.out.println("Produced Data.");
    notify(); // notify consumer thread to proceed
    Thread.sleep(500);
  }

  public synchronized void consume() throws InterruptedException {
    while (!hasData) {
      System.out.println("cosumer -> self wait ...");
      wait(); // wait() control current Thread to sleep
    }
    System.out.println(
        "Thread ID:" + Thread.currentThread().getId() + ":Consuming data...");
    Thread.sleep(2000); // simulate produce process...
    hasData = false;
    System.out.println("Consumed Data.");
    notify();
    Thread.sleep(500);
  }

  public static void main(String[] args) {
    SharedResource sharedResource = new SharedResource();

    Runnable produceData = () -> {
      while (true) {
        try {
          sharedResource.produce();
        } catch (InterruptedException e) {

        }
      }
    };

    Runnable consumeData = () -> {
      while (true) {
        try {
          sharedResource.consume();
        } catch (InterruptedException e) {

        }
      }
    };

    Thread producer = new Thread(produceData);
    Thread consumer = new Thread(consumeData);

    producer.start();
    consumer.start();
    System.out.println("main ends ...");
  }


}
package CoreJava;

public class SignalProcessor {
      final void processSignal(){
          System.out.println("Processing single 1");
      }
}

class AdvancedSignalProcessor extends SignalProcessor{
//    @Override overridden method is final error if we use final
//     protected void processSignal(){// cannot override
//        System.out.println("Processing single 2");
//    }

    public static void main(String[] args) {
        AdvancedSignalProcessor processor = new AdvancedSignalProcessor();
        processor.processSignal();

        SignalProcessor signalProcessor=new SignalProcessor();
        signalProcessor.processSignal();
    }
}

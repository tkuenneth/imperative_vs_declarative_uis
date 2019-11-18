import SwiftUI

struct ContentView: View {
    
    @State var counter = 0
    
    var body: some View {
        VStack {
            VStack {
                if (counter == 0) {
                    Text("Noch nicht geklickt")
                        .font(Font.system(size: 14))
                        .italic()
                } else {
                    Text("\(counter)")
                        .font(Font.system(size: 72))
                        .bold()
                }
            }
            .frame(height: 100)
            .fixedSize()
            Button("Klick") {
                self.counter += 1
            }
        }
    }
}

#if DEBUG
struct ContentView_Previews: PreviewProvider {
  static var previews: some View {
    ContentView()
  }
}
#endif

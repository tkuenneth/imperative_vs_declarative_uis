import SwiftUI

struct ContentView: View {
    
    @State
    var counter: Int = 0
    
    var body: some View {
        VStack(alignment: .center) {
            VStack(alignment: .center) {
                if (counter == 0) {
                    Text("Noch nicht geklickt")
                        .font(Font.system(size: 14))
                        .italic()
                }
                else {
                    Text("\(counter)")
                        .font(Font.system(size: 72))
                        .bold()
                }
            }
            .frame(height: 100)
            .fixedSize()
            Button(action: {
                self.counter += 1
            })
            {
                Text("Klick")
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

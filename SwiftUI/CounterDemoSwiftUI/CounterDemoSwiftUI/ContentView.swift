import SwiftUI

struct ContentView: View {

    @State var counter = 0

    var body: some View {
        VStack {
            if (counter == 0) {
                Text("Noch nicht geklickt")
                    .font(Font.system(size: 14))
                    .italic()
                    .addFrame(withHeight: 100)
            } else {
                Text("\(counter)")
                    .font(Font.system(size: 72))
                    .bold()
                    .addFrame(withHeight: 100)
            }
            Button("Klick") {
                self.counter += 1
            }
        }
    }
}

extension Text {
    func addFrame(withHeight height: CGFloat) -> some View {
        self.frame(height: height).fixedSize()
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}

using Windows.UI.Text;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;

namespace CounterDemoUWP
{
    public sealed partial class MainPage : Page
    {
        public CounterDemoViewModel ViewModel { get; } = new CounterDemoViewModel();

        public MainPage()
        {
            this.InitializeComponent();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            if (ViewModel.Count == 0)
            {
                ViewModel.LabelFontSize = 72.0;
                ViewModel.LabelFontStyle = FontStyle.Normal;
                ViewModel.LabelFontWeight = FontWeights.Bold;
            }
            ViewModel.Label = $"{++ViewModel.Count}";
        }
    }
}

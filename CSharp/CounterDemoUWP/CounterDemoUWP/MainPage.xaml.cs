using System.ComponentModel;
using Windows.UI.Text;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;

namespace CounterDemoUWP
{
    public sealed partial class MainPage : Page, INotifyPropertyChanged
    {
        public event PropertyChangedEventHandler PropertyChanged;

        public FontWeight LabelFontWeight
        {
            get => _labelFontWeight;
            set
            {
                if (!_labelFontWeight.Equals(value))
                {
                    _labelFontWeight = value;
                    PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(nameof(LabelFontWeight)));
                }
            }
        }
        private FontWeight _labelFontWeight = FontWeights.Normal;

        public FontStyle LabelFontStyle
        {
            get => _labelFontStyle;
            set
            {
                if (_labelFontStyle != value)
                {
                    _labelFontStyle = value;
                    PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(nameof(LabelFontStyle)));
                }
            }
        }
        private FontStyle _labelFontStyle = FontStyle.Italic;

        public double LabelFontSize
        {
            get => _labelFontSize;
            set
            {
                if (_labelFontSize != value)
                {
                    _labelFontSize = value;
                    PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(nameof(LabelFontSize)));
                }
            }
        }
        private double _labelFontSize = 14.0;

        public string Label
        {
            get => _label;
            set
            {
                if (_label != value)
                {
                    _label = value;
                    PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(nameof(Label)));
                }
            }
        }
        private string _label = "Noch nicht geklickt";
        private int _count;

        public MainPage()
        {
            this.InitializeComponent();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            if (_count == 0)
            {
                LabelFontSize = 72.0;
                LabelFontStyle = FontStyle.Normal;
                LabelFontWeight = FontWeights.Bold;
            }
            Label = $"{++_count}";
        }
    }
}

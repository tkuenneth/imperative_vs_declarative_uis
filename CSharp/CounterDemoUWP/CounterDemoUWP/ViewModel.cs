using Windows.UI.Text;

namespace CounterDemoUWP
{
    public class CounterDemoViewModel : ViewModelBase
    {
        private FontWeight _labelFontWeight = FontWeights.Normal;
        public FontWeight LabelFontWeight
        {
            get => _labelFontWeight;
            set => SetProperty(ref _labelFontWeight, value, nameof(LabelFontWeight));
        }

        private FontStyle _labelFontStyle = FontStyle.Italic;
        public FontStyle LabelFontStyle
        {
            get => _labelFontStyle;
            set => SetProperty(ref _labelFontStyle, value, nameof(LabelFontStyle));
        }

        private double _labelFontSize = 14.0;
        public double LabelFontSize
        {
            get => _labelFontSize;
            set => SetProperty(ref _labelFontSize, value, nameof(LabelFontSize));
        }

        private string _label = "Noch nicht geklickt";
        public string Label
        {
            get => _label;
            set => SetProperty(ref _label, value, nameof(Label));
        }

        public int Count { get; set; }
    }
}

using Xamarin.Forms;

namespace CounterDemoXamarin
{
    public class ViewModel : ViewModelBase
    {
        private FontAttributes _labelFontAttributes = FontAttributes.Italic;
        public FontAttributes LabelFontAttributes
        {
            get => _labelFontAttributes;
            set => SetProperty(ref _labelFontAttributes, value, nameof(LabelFontAttributes));
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
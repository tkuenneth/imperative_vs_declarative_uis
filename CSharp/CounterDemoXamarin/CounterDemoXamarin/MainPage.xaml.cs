using System;
using System.ComponentModel;
using Xamarin.Forms;

namespace CounterDemoXamarin
{
    [DesignTimeVisible(false)]
    public partial class MainPage : ContentPage
    {
        public ViewModel ViewModel { get; } = new ViewModel();

        public MainPage()
        {
            InitializeComponent();
            BindingContext = this;
        }

        private void Button_Click(object sender, EventArgs e)
        {
            if (ViewModel.Count == 0)
            {
                ViewModel.LabelFontSize = 72.0;
                ViewModel.LabelFontAttributes = FontAttributes.Bold;
            }
            ViewModel.Label = $"{++ViewModel.Count}";
        }
    }
}
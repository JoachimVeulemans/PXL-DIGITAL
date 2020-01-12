//InvoerDemo
string sourcepath = Environment.GetFolderPath(Environment.SpecialFolder.MyDocuments);
string myfile = System.IO.Path.Combine(sourcepath, "myfile.txt");
StreamReader inputStream = File.OpenText(myfile);
string line = inputStream.ReadLine();
while(line!=  null)
{
    fileTextBox.AppendText(line);
    fileTextBox.AppendText(Environment.NewLine);
    line = inputStream.ReadLine();
}
catch (FileNotFoundException)
{
    MessageBox.Show("Bestand niet gevonden!");
}
finally
{
    inputStream?.Close();
}

//UitvoerDemo
            string destination = Environment.GetFolderPath(Environment.SpecialFolder.DesktopDirectory);
            string file = System.IO.Path.Combine(destination, "adres.txt");
            StreamWriter s = File.CreateText(file);
            s.WriteLine("Joachim Veulemans");
            s.WriteLine("Straat huisnummer");
            s.WriteLine("3270 Scherpenheuvel");
            s.Close();

//MenuDemo
    <DockPanel>
        <Menu DockPanel.Dock="Top">
            <MenuItem Header="_File">
                <MenuItem Header="_Open" />
                <MenuItem Header="_Save" />
                <Separator />
                <MenuItem Header="E_xit"/>
            </MenuItem>
            <MenuItem Header="_Help">
                <MenuItem Header="_About"/>
            </MenuItem>

        </Menu>
        <Grid DockPanel.Dock="Bottom">

        </Grid>
    </DockPanel>

//Sorteren
List<SoortObject> naam = naam.OrderBy(o => o.OrderNaam).ToList();

//String omdraaien (Reverse)
public static string Reverse(string s)
    {
        char[] charArray = s.ToCharArray();
        Array.Reverse(charArray);
        return new string(charArray);
    }

//Dictionary
private Dictionary <string, Object> naam = new Dictionary <string, Object>();

//Klasse Directory
GetFiles(path);
GetDirectories(path);

//FolderBrowserDialog add reference Windows.Forms
folderBrowser.ShowDialog();
allFiles = Directory.GetFiles(folderBrowser.SelectedPath, "*.txt");


//StreamWriter
StreamWriter outputStream = File.createTex("NaamFile.txt");
outputStream.WriteLine("Tekst");
outputStream.close();

//Slider
<Slider TickPlacement="BottomRight" Name="ValueCardsSlider"  TickFrequency="1" IsSnapToTickEnabled="True" Minimum="1"  Maximum="13"  HorizontalAlignment="Left" Margin="168,155,0,0" VerticalAlignment="Top" RenderTransformOrigin="0.151,1.709" Width="200"/>

//Afbeelding
BitmapImage bi = new BitmapImage();
bi.BeginInit();
bi.UriSource = uri;
bi.EndInit();
Image image = new Image()
{
Width = 0,
Height = 0,
Margin = new Thickness(0, 0, 0, 0),
Source = bi
};
CardCanvas.Children.Add(image);

//OpenFile Dialog
OpenFileDialog OpenFileDialog = new OpenFileDialog();
string startdir = Environment.GetFolderPath(Environment.SpecialFolder.MyDocuments);
OpenFileDialog.InitialDirectory = startdir;
OpenFileDialog.Filter = "Image Files | *.BMP;" + "*.JPG; *.GIF|Zll files(*.*) | *.*";

if(OpenFileDialog.ShowDialog() == true){
    Messagbox.show(OpenFileDialog.FileName);
}

//OpenFileInCurrentDirectory
OpenFileDialog fileDialog = new OpenFileDialog();
            string path = Environment.CurrentDirectory;

            for (int i = 0; i < 2; i++)
            {
                path = path.Remove(path.LastIndexOf('\\'));
            }

            fileDialog.InitialDirectory = path;
            fileDialog.Filter = "Text Files|*.txt";
            if (fileDialog.ShowDialog() == true) //User clicks open
            {
                path = fileDialog.FileName;
                StreamReader inputStream = null;

                try
                {
					inputStream = File.OpenText(path);
					string line = inputStream.ReadLine();
                    while(line!=  null)
                    {
                        fileTextBox.AppendText(line);
                        fileTextBox.AppendText(Environment.NewLine);
                        line = inputStream.ReadLine();
                    }
                }
                catch (FileNotFoundException ex)
                {
                    MessageBox.Show(ex.Message);
                }
                catch (UnauthorizedAccessException ex)
                {
                    MessageBox.Show(ex.Message);
                }
                catch (FormatException ex)
                {
                    MessageBox.Show(ex.Message);
                }
                catch (NullReferenceException)
                {
                    MessageBox.Show("Error: not enough lines in file!");
                }
                finally
                {
                    inputStream?.Close();
                }
            }

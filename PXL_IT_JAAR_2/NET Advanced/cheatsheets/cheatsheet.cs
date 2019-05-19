//REVERSE
scaffold-dbcontext -provider Microsoft.EntityFrameworkCore.SqlServer -connection ""

//JOIN
SELECT CocktailId, IngredientId, Quantity, Name, Unit
FROM CocktailIngredients JOIN Ingredients 
ON CocktailIngredients.IngredientID=Ingredients.Id WHERE CocktailIngredients.CocktailId=@CocktailId

//CONNECTIONSTRING
return new SqlConnection(ConfigurationManager.ConnectionStrings[""].ConnectionString);

//EF UPDATE
var entity = _context.TABLE.Find(id);
if (entity == null) { return; }
_context.Entry(entity).CurrentValues.SetValues(item);

//GET ALL
var name = new List<>();

SqlConnection connection = _connectionFactory.CreateSqlConnection();
string selectStatement = "";
var selectCommand = new SqlCommand(selectStatement, connection);

SqlDataReader reader = null;
try
{
    connection.Open();
    reader = selectCommand.ExecuteReader();
    
    int aaaOrdinal = reader.GetOrdinal("aaa");

    while (reader.Read())
    {
        var element = new ()
        {
            prop = reader.IsDBNull(ordinal) ? null : reader.GetString(ordinal),
            prop = reader.IsDBNull(ordinal) ? (decimal?) null : reader.GetDecimal(ordinal),
            prop = reader.IsDBNull(ordinal) ? int.MinValue : reader.GetInt32(ordinal)

        };
        list.Add(element);
    }

}
finally
{
    connection?.Close();
    reader?.Close();
}

return list;


// GET WITH PARAMETER (ID)
var list = new List<>();

var connection = _connectionFactory.CreateSqlConnection();
string selectStatement = "SELECT Id, AccountNumber, Balance, AccountType, CustomerId " +
                        "FROM dbo.Accounts " +
                        "WHERE CustomerId = @CustomerId";

var selectCommand = new SqlCommand(selectStatement, connection);
selectCommand.Parameters.AddWithValue("@CustomerId", customerId);
SqlDataReader reader = null;
try
{
    connection.Open();
    reader = selectCommand.ExecuteReader();

    int aaaOrdinal = reader.GetOrdinal("aaa");

    while (reader.Read())
    {
        var element = new ()
        {
            prop = reader.IsDBNull(ordinal) ? null : reader.GetString(ordinal),
            prop = reader.IsDBNull(ordinal) ? (decimal?) null : reader.GetDecimal(ordinal),
            prop = reader.IsDBNull(ordinal) ? int.MinValue : reader.GetInt32(ordinal)

        };
        list.Add(element);
    }

}
finally
{
    connection?.Close();
    reader?.Close();
}

return list;

// ADD
string statement = "INSERT INTO Accounts (AccountNumber, Balance, AccountType, CustomerId) " +
                               "VALUES(@AccountNumber, @Balance, @AccountType, @CustomerId) " +
                               "SET @AccountId = SCOPE_IDENTITY()";
SqlConnection connection = iconnectionFactory.CreateSqlConnection();
SqlCommand command = new SqlCommand(statement, connection);

// Parameters
SqlParameter AccountNumberParameter = new SqlParameter("@AccountNumber", newAccount.AccountNumber);
if (AccountNumberParameter.Value == null)
{
    AccountNumberParameter.Value = DBNull.Value;
}

//Output
SqlParameter AccountIdParameter = new SqlParameter("@AccountId", SqlDbType.Int);
AccountIdParameter.Direction = ParameterDirection.Output;

command.Parameters.Add(AccountNumberParameter);
command.Parameters.Add(AccountIdParameter);

try
{
    connection.Open();
    int rowsAffected = command.ExecuteNonQuery();
    //newAccount.Id = (int)AccountIdParameter.Value;
}
finally
{
    connection?.Close();
}
        
//UPDATE
string statement = "UPDATE Accounts SET AccountNumber = @AccountNumber, Balance = @Balance, AccountType = @AccountType, CustomerId = @CustomerId " +
                    "WHERE Id = @AccountID";
SqlConnection connection = iconnectionFactory.CreateSqlConnection();
SqlCommand command = new SqlCommand(statement, connection);

// Parameters
SqlParameter AccountNumberParameter = new SqlParameter("@AccountNumber", existingAccount.AccountNumber);
if (AccountNumberParameter.Value == null)
{
    AccountNumberParameter.Value = DBNull.Value;
}

command.Parameters.Add(AccountNumberParameter);

try
{
    connection.Open();
    int rowsAffected = command.ExecuteNonQuery();
}
finally
{
    connection?.Close();
}

//TRANSACTION
string statement = "UPDATE Accounts " +
                    "SET Balance = Balance + @Amount " +
                    "WHERE Id = @AccountNumber";
SqlTransaction transaction = null;
SqlConnection connection = iconnectionFactory.CreateSqlConnection();
SqlCommand fromCommand = new SqlCommand(statement, connection);
SqlCommand toCommand = new SqlCommand(statement, connection);

// Parameters From
SqlParameter AccountNumberParameter = new SqlParameter("@AccountNumber", fromAccountId);
if (AccountNumberParameter.Value == null)
{
    AccountNumberParameter.Value = DBNull.Value;
}
SqlParameter amountParameter = new SqlParameter("@Amount", -amount);
if (amountParameter.Value == null)
{
    amountParameter.Value = DBNull.Value;
}

fromCommand.Parameters.Add(AccountNumberParameter);
fromCommand.Parameters.Add(amountParameter);

// Parameters To
SqlParameter ToAccountNumberParameter = new SqlParameter("@AccountNumber", toAccountId);
if (ToAccountNumberParameter.Value == null)
{
    ToAccountNumberParameter.Value = DBNull.Value;
}
SqlParameter ToAmountParameter = new SqlParameter("@Amount", amount);
if (ToAmountParameter.Value == null)
{
    ToAmountParameter.Value = DBNull.Value;
}

toCommand.Parameters.Add(ToAccountNumberParameter);
toCommand.Parameters.Add(ToAmountParameter);

try
{
    connection.Open();
    transaction = connection.BeginTransaction();

    fromCommand.Transaction = transaction;
    toCommand.Transaction = transaction;

    int numberOfRowsAffected = fromCommand.ExecuteNonQuery();
    if (numberOfRowsAffected > 0)
    {
        numberOfRowsAffected = toCommand.ExecuteNonQuery();
        if (numberOfRowsAffected > 0)
        {
            transaction.Commit();
        }
        else
        {
            transaction.Rollback();
        }
    }
    else
    {
        transaction.Rollback();
    }

}
catch (SqlException)
{
    transaction?.Rollback();
    throw;
}
finally
{
    connection?.Close();
}

//BITMAP IMAGE
String stringPath = "Images/" + name + ".jpg";
Uri imageUri = new Uri(stringPath, UriKind.Relative);
BitmapImage imageBitmap = new BitmapImage(imageUri);

//BRUSH
<Button Foreground="White" FontWeight="Bold" Content="Brush Button" HorizontalAlignment="Left" Margin="46,154,0,0" VerticalAlignment="Top" Width="94">
    <Button.Background>
        <LinearGradientBrush StartPoint="0, 0" EndPoint="1, 0">
            <GradientStopCollection>
                <GradientStop Color="Yellow" Offset="0"></GradientStop>
                <GradientStop Color="Red" Offset="0.33"></GradientStop>
                <GradientStop Color="Blue" Offset="0.66"></GradientStop>
                <GradientStop Color="Green" Offset="1"></GradientStop>
            </GradientStopCollection>
        </LinearGradientBrush>
    </Button.Background>
</Button>

//TRIGGER
<Window.Resources>
    <Style x:Key="TriggerStyle" TargetType="{x:Type ToggleButton}">
        <Setter Property="Content" Value="Aan"></Setter>
        <Style.Triggers>
            <Trigger Property="IsChecked" Value="False">
                <Setter Property="Content" Value="Uit"></Setter>
            </Trigger>
        </Style.Triggers>
    </Style>
</Window.Resources>

//TEMPLATE
<Button Template="{StaticResource RoundButton}" Content="Button"/>
<Application.Resources>
    <ControlTemplate TargetType="Button" x:Key="RoundButton">
        <Grid>
            <Ellipse x:Name="OuterEllipse" Margin="0, 0, 0, 0">
                <Ellipse.Fill>
                    <LinearGradientBrush StartPoint="0, 0" EndPoint="0, 1">
                        <GradientStop Offset="0" Color="Green"></GradientStop>
                        <GradientStop Offset="1" Color="Purple"></GradientStop>
                    </LinearGradientBrush>
                </Ellipse.Fill>
            </Ellipse>
            <Ellipse Margin="7, 7, 7, 7">
                <Ellipse.Fill>
                    <LinearGradientBrush StartPoint="0, 0" EndPoint="0, 1">
                        <GradientStop Offset="0" Color="LightBlue"></GradientStop>
                        <GradientStop Offset="1" Color="Blue"></GradientStop>
                    </LinearGradientBrush>
                </Ellipse.Fill>
            </Ellipse>
            <ContentPresenter HorizontalAlignment="Center" VerticalAlignment="Center" Content="Button"></ContentPresenter>
        </Grid>
        <ControlTemplate.Triggers>
            <Trigger Property="IsMouseOver" Value="True">
                <Setter TargetName="OuterEllipse" Property="Ellipse.Fill">
                    <Setter.Value>
                        <SolidColorBrush Color="Black"></SolidColorBrush>
                    </Setter.Value>
                </Setter>
            </Trigger>
            <Trigger Property="IsPressed" Value="True">
                <Setter Property="RenderTransform">
                    <Setter.Value>
                        <ScaleTransform ScaleX="0.2" ScaleY="0.2"></ScaleTransform>
                    </Setter.Value>
                </Setter>
                <Setter Property="RenderTransformOrigin">
                    <Setter.Value>
                        <Point X="0.5" Y="0.5"></Point>
                    </Setter.Value>
                </Setter>
            </Trigger>
        </ControlTemplate.Triggers>
    </ControlTemplate>
</Application.Resources>

//GRID
<Grid ShowGridLines="True" DockPanel.Dock="Left" Width="410">
    <Grid.ColumnDefinitions>
        <ColumnDefinition Width="100" />
        <ColumnDefinition Width="*" />
    </Grid.ColumnDefinitions>
    <Grid.RowDefinitions>
        <RowDefinition Height="1*" />
        <RowDefinition Height="3*" />
    </Grid.RowDefinitions>
    <HIER UW OBJECTEN>
</Grid>

//CONVERTER (erft over van een IValueConverter)
xmlns:c="clr-namespace:Exercise2.Converters"

<Window.Resources>
    <c:RatingConverter x:Key="ratingConverter"></c:RatingConverter>
</Window.Resources>

Text="{Binding Rating, Converter={StaticResource ratingConverter}, Mode=TwoWay}"

//UNIT TESTING
[SetUp]
public void SetUpFizzBuzzService()
{
    fizzBuzzService = new FizzBuzzService();
}

[TestCase(2, 3, 1, "1")]
[TestCase(4, 5, 4, "1 2 3 Fizz")]
[TestCase(5, 4, 4, "1 2 3 Buzz")]
[TestCase(2, 3, 15, "1 Fizz Buzz Fizz 5 FizzBuzz 7 Fizz Buzz Fizz 11 FizzBuzz 13 Fizz Buzz")]
[TestCase(2, 2, 4, "1 FizzBuzz 3 FizzBuzz")]

[Test]
public void ReturnsCorrectFizzBuzzTextWhenParametersAreValid(int fizzFactor, int buzzFactor, int lastNumber, string expected)
{
    // NORMAL
    Assert.That(fizzBuzzService.GenerateFizzBuzzText(fizzFactor, buzzFactor, lastNumber), Is.EqualTo(expected));

    // THROW NOTHING
    Assert.That(() => sut.TransferMoney(account1, account2, 1000), Throws.Nothing);

    // THROW SOMETHING
    Assert.That(() => sut.TransferMoney(account1, account2, 1000), Throws.TypeOf<InvalidTransferException>());
}

//DBCONTEXT

public class LotteryContext : DbContext
    {
        public DbSet<LotteryGame> LotteryGame { get; set; }

        public LotteryContext(){}

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            if (!optionsBuilder.IsConfigured)
            {
                optionsBuilder.UseSqlServer(ConfigurationManager.ConnectionStrings["LotteryConnectionString"].ConnectionString);
            }
        }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            modelBuilder.Entity<LotteryGame>().Property(s => s.Name).IsRequired();
            modelBuilder.Entity<DrawNumber>().HasKey(dn => new { dn.DrawId, dn.Number });
            modelBuilder.Entity<Customer>().HasMany<Account>();
            modelBuilder.Entity<Customer>().HasOne<City>();

            modelBuilder.Entity<LotteryGame>().HasData(new LotteryGame
            {
                Id = 1,
                Name = "National lottery",
                MaximumNumber = 45,
                NumberOfNumbersInADraw = 6
            }, new LotteryGame
            {
                Id = 2,
                Name = "Keno",
                MaximumNumber = 70,
                NumberOfNumbersInADraw = 20
            });

            base.OnModelCreating(modelBuilder);
        }

        public void CreateOrUpdateDatabase()
        {
            this.Database.Migrate();
        }
    }

//INOTIFYCHANGED (overerven van  : INotifyPropertyChanged)
private decimal _balance;

public decimal Balance
{
    get => _balance;
    set
    {
        _balance = value;
        OnPropertyChanged();
    }
}

public event PropertyChangedEventHandler PropertyChanged;

protected virtual void OnPropertyChanged([CallerMemberName] string propertyName = null)
{
    PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(propertyName));
}

//CITY COMBOBOX
<DataGridComboBoxColumn Header="City" SelectedValueBinding="{Binding ZipCode}" SelectedValuePath="ZipCode" DisplayMemberPath="Name" x:Name="CityComboBox"/>
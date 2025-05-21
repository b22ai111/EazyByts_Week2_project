async function buyStock() {
    const symbol = document.getElementById('stockSymbol').value;
    const response = await fetch(`/api/trade/buy?symbol=${symbol}`, { method: 'POST' });
    const result = await response.json();
    alert(result.message);
    loadPortfolio();
  }
  
  async function loadPortfolio() {
    const res = await fetch('/api/portfolio');
    const data = await res.json();
    document.getElementById('portfolio').innerHTML = JSON.stringify(data, null, 2);
  }
  